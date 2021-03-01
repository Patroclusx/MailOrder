package net.mailorder.webservices;

import net.mailorder.SessionFactoryUtil;
import net.mailorder.entities.OrdersEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;


@WebService
public class TrackingService {

    /**
     * Takes the tracking number and searches the database for information relevant to it
     * @param trackingNumber Tracking number associated with the data
     * @return Returns a String array of all the relevant data
     */
    @WebMethod
    public String[] getDataFromTracking(@WebParam String trackingNumber){
        final Session session = SessionFactoryUtil.getInstance().openSession();
        session.beginTransaction();

        try {
            Query query = session.createQuery("from OrdersEntity ");
            List<OrdersEntity> fetchedData = query.list();

            for(OrdersEntity entity : fetchedData){
                if(entity.getTracking().equals(trackingNumber)){
                    String[] resultData = {entity.getFname(), entity.getLname(), entity.getAddr1(),
                            entity.getAddr2(), entity.getAddrCity(), entity.getAddrPost(), entity.getToAddr1(),
                            entity.getToAddr2(), entity.getToAddrCity(), entity.getToAddrPost()};
                    return resultData;
                }
            }
        }finally {
            session.getTransaction().commit();
            session.close();
        }

        return null;
    }
}

package net.mailorder.webservices;

import net.mailorder.SessionFactoryUtil;
import net.mailorder.entities.OrdersEntity;
import org.hibernate.Session;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Random;

@WebService
public class OrderService {

  private String charSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private int charSetLength = charSet.length();

  /**
   * Generates a random 16 character tracking number
   * @return Returns the generated tracking number
   */
  @WebMethod
  public String generateTrackingNumber(){
    Random random = new Random();
    String trackingNumber = "";

    for(int i = 0; i < 16; i++){
      trackingNumber += charSet.charAt(random.nextInt(charSetLength));
    }

    return trackingNumber;
  }

  /**
   * Saves the data passed onto the database
   * @param personalData String array of personal data
   * @param destinationData String array of destination data
   * @param commentData Comment data
   * @param trackingNumber Tracking Number
   */
  @WebMethod
  public void saveOrderData(String[] personalData, String[] destinationData, String commentData, String trackingNumber) {
    final Session session = SessionFactoryUtil.getInstance().openSession();
    session.beginTransaction();

    try {
      OrdersEntity ordersEntity = new OrdersEntity();
      ordersEntity.setFname(personalData[0]);
      ordersEntity.setLname(personalData[1]);
      ordersEntity.setAddr1(personalData[2]);
      ordersEntity.setAddr2(personalData[3]);
      ordersEntity.setAddrCity(personalData[4]);
      ordersEntity.setAddrPost(personalData[5]);

      ordersEntity.setToAddr1(destinationData[2]);
      ordersEntity.setToAddr2(destinationData[3]);
      ordersEntity.setToAddrCity(destinationData[4]);
      ordersEntity.setToAddrPost(destinationData[5]);

      ordersEntity.setTracking(trackingNumber);

      session.save(ordersEntity);
    } finally {
      session.getTransaction().commit();
      session.close();
    }
  }
}

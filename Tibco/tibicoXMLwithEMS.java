package rekru.rozmowy.Tibco;

import javax.jms.*;

//Obsługa wiadomości JMS przy użyciu Tibco EMS
public class tibicoXMLwithEMS  implements MessageListener {
        private Connection connection;
        private Session session;
        private MessageConsumer consumer;

        public void init() throws Exception {
            ConnectionFactory factory = new TibjmsConnectionFactory("tcp://localhost:7222");
            connection = factory.createConnection("admin", "");
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("myQueue");
            consumer = session.createConsumer(destination);
            consumer.setMessageListener(this);
            connection.start();
        }

        public void onMessage(Message message) {
            try {
                if (message instanceof TextMessage) {
                    String text = ((TextMessage) message).getText();
                    System.out.println("Received message: " + text);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void stop() throws Exception {
            consumer.close();
            session.close();
            connection.close();
        }
    }
}


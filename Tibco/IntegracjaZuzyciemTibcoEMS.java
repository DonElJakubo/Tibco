package rekru.rozmowy.Tibco;

public class IntegracjaZuzyciemTibcoEMS {
    // Tworzenie połączenia z Tibco EMS
    ConnectionFactory connectionFactory = new TIBCO.EMS.ConnectionFactory("tcp://localhost:7222");
    Connection connection = connectionFactory.createConnection("username", "password");
    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

    // Tworzenie wiadomości do wysłania
    TextMessage message = session.createTextMessage();
message.setText("Hello, world!");

    // Wysyłanie wiadomości do kolejki
    Queue queue = session.createQueue("moja-kolejka");
    MessageProducer producer = session.createProducer(queue);
producer.send(message);

// Zamykanie połączenia z Tibco EMS
session.close();
connection.close();

}

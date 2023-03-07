package rekru.rozmowy.Tibco;

// Wysyłanie wiadomości do kolejki Tibco EMS:

// Importowanie klas do obsługi Tibco EMS
import javax.jms.*;
public class sendingMessegesToTibcoQueue {


    // Ustawienie połączenia z serwerem Tibco EMS
    ConnectionFactory factory = new TibjmsConnectionFactory("tcp://localhost:7222");
    Connection connection = factory.createConnection("admin", "");
    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

    // Utworzenie wiadomości
    TextMessage message = session.createTextMessage("To jest testowa wiadomość");

    // Wysłanie wiadomości do kolejki
    Queue queue = session.createQueue("myqueue");
    MessageProducer producer = session.createProducer(queue);
producer.send(message);

// Zamknięcie połączenia z serwerem Tibco EMS
connection.close();

}

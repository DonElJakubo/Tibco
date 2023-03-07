package rekru.rozmowy.Tibco;

//Integracja dwóch systemów z użyciem Tibco BusinessWorks

public class TibcoBW  extends BusinessProcess {

        public void process() throws Exception {
            String data = getInputData("/Input/data");
            String response = invokeWebService("http://example.com/service", data);
            setOutputData("/Output/response", response);
        }

        private String invokeWebService(String endpoint, String data) {
            // Kod wywołujący usługę webową
        }
    }

}

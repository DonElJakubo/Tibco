package rekru.rozmowy.Tibco;

public class TibcoNewImplementation {

    // Tworzenie nowego procesu biznesowego
    ProcessDefinition processDef = new ProcessDefinition();
processDef.setName("MojaAplikacja");

    // Dodawanie nowego wyzwalacza
    TriggerDefinition trigger = new TriggerDefinition();
trigger.setName("Wyzwalacz");
trigger.setType("Timer");
trigger.setTimerExpression("*/5 * * * * ?");
processDef.setTrigger(trigger);

    // Dodawanie kroku do procesu biznesowego
    ProcessStepDefinition step = new ProcessStepDefinition();
step.setName("Krok1");
step.setActivity("Invoke");
step.setTargetService("MojaUsługa");
step.setTargetOperation("MojaOperacja");
processDef.addStep(step);

}

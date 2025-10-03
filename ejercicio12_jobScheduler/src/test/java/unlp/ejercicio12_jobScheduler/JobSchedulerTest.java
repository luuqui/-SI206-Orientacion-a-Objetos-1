package unlp.ejercicio12_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {
        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new JobScheduler(new FIFOStrategy());
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler(new LIFOStrategy());
        aScheduler.schedule(highestPriorityJob);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNextFIFO() {
        JobScheduler scheduler = new JobScheduler(new FIFOStrategy());
        scheduleJobsIn(scheduler);

        JobDescription next = scheduler.next();
        assertEquals(firstJob, next);  // Debe devolver el primero ingresado
        assertFalse(scheduler.getJobs().contains(firstJob)); // Ya no debe estar
    }

    // 🔹 Test para LIFO
    @Test
    void testNextLIFO() {
        JobScheduler scheduler = new JobScheduler(new LIFOStrategy());
        scheduleJobsIn(scheduler);

        JobDescription next = scheduler.next();
        assertEquals(lastJob, next);  // Debe devolver el último ingresado
        assertFalse(scheduler.getJobs().contains(lastJob));
    }

    // 🔹 Test para HighestPriority
    @Test
    void testNextHighestPriority() {
        JobScheduler scheduler = new JobScheduler(new HIGHESTPRIORITYStrategy());
        scheduleJobsIn(scheduler);

        JobDescription next = scheduler.next();
        assertEquals(highestPriorityJob, next);  // El de mayor prioridad
        assertFalse(scheduler.getJobs().contains(highestPriorityJob));
    }

    // 🔹 Test para MostEffort
    @Test
    void testNextMostEffort() {
        JobScheduler scheduler = new JobScheduler(new MOSTEFFORTStrategy());
        scheduleJobsIn(scheduler);

        JobDescription next = scheduler.next();
        assertEquals(mostEffortJob, next);  // El de mayor esfuerzo
        assertFalse(scheduler.getJobs().contains(mostEffortJob));
    }

    // 🔹 Test para lista vacía
    @Test
    void testNextEmpty() {
        JobScheduler scheduler = new JobScheduler(new FIFOStrategy());
        JobDescription next = scheduler.next();
        assertNull(next);  // Debe ser null porque no hay trabajos
    }
}

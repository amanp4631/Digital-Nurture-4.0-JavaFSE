import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void testExternalApi() {
        ExternalAPI mockApi = mock(ExternalAPI.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        Service service = new Service(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void testVerifyInteraction() {
        ExternalAPI mockApi = mock(ExternalAPI.class);

        Service service = new Service(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}
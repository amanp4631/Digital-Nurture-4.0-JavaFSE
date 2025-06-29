public class Service {
    private final ExternalAPI externalApi;

    public Service(ExternalAPI externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
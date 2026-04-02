package ro.ase.cts.clase;

public class Service implements IService{
    private int serviceId;
    private static Service service=null;

    @Override
    public synchronized void repara(Masina masina) {
        System.out.println(masina.numarInmatriculare+"a fost reparata");
    }

    private Service(int serviceId) {
        this.serviceId = serviceId;
    }
    public static synchronized Service getService(int serviceId)
    {
        if(service==null)
            service=new Service(1234);

        return service;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("serviceId=").append(serviceId);
        sb.append('}');
        return sb.toString();
    }
}

package StrategyDPCorejavaComs;


public final class BlueDart implements ICourier{

    public BlueDart() {
        System.out.println("no-arg constructor-BlueDart()");
    }

    @Override
    public String deliver(int oid) {
        System.out.println("Blue Dart.deliver()");
        return "order id" + oid + "order items ready to deliver Blue Dart Courier Service";
    }
}

package Panels;

import java.util.function.Supplier;

public class PanouTablaSingleton {
    private static final Supplier<PanouTabla> instance =
            new Supplier<>() {
                private final PanouTabla singletonInstance = new PanouTabla();

                @Override
                public PanouTabla get() {
                    return singletonInstance;
                }
            };
    private PanouTablaSingleton() {}
    public static PanouTabla getInstance() {
        return instance.get();
    }
}

public class Datos {
    private Rates conversion_rates;

    public Rates getConversionRates() {
        return conversion_rates;
    }

    public static class Rates {
        private double ARS;
        private double COP;
        private double BRL;
        private double USD;

        public double getARS() {
            return ARS;
        }

        public double getCOP() {
            return COP;
        }

        public double getBRL() {
            return BRL;
        }

        public double getUSD() {
            return USD;
        }
    }
}

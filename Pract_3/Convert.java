package Pract_3;
import java.text.NumberFormat;
import java.util.Locale;

public class Convert {
    public static class Converta {
        private double currency;
        Locale russian = new Locale("ru");
        NumberFormat get_loc = NumberFormat.getCurrencyInstance(russian);
        NumberFormat get_JAP = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat get_US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat get_Chi = NumberFormat.getCurrencyInstance(Locale.CHINA);

        public Converta(double currency) {
            this.currency = currency;
        }

        public double getCurrency() {
            return currency;
        }

        public void setCurrency(double currency) {
            this.currency = currency;
        }


        @Override
        public String toString() {
            return "Converta{" +
                    "currency in Rus loc = " + get_loc.format(currency) +
                    "\n currency in Jap loc = " + get_JAP.format(currency*1.58) +
                    "\n currency in US loc = " + get_US.format(currency*0.011) +
                    "\n currenct in Chi loc = " + get_Chi.format(currency*0.075) +
                    '}';
        }
    }

    public static void main(String[] args) {
        Converta bnk1 = new Converta(1000.0);
        System.out.println(bnk1);
    }
}

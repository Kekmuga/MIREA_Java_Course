package Pract_4;

public class Atelie {
    public enum Size {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);

        public static String getDescription(Size siz){
            String gig = "";
            switch (siz){
                case XXS: gig = "kid"; break;
                case XS: gig = "semi kid"; break;
                case S: gig = "old"; break;
                case M: gig = "med"; break;
                case L: gig = "large"; break;
            }
            return gig;
        }
        private final int euroSize;

        Size(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            return "Взрослый размер";
        }

    }
    public static void main(String[] args) {
        for (Size size : Size.values()) {
            System.out.println(size + ": " + size.getDescription() + ", Euro size: " + size.getEuroSize());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Gezegen gezegenler = Gezegen.MERKUR;
        gezegenlerBilgi(gezegenler);
    }
    static void gezegenlerBilgi (Gezegen gezegenler)
    {
        String ayrac="----------------------------------------------------------------------------------------------------------------------------------------------------------";
        switch (gezegenler) {
            case MERKUR :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case VENUS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case DUNYA :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case MARS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case JUPITER :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case SATURN :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case URANUS :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
            case NEPTUN :
                System.out.println(ayrac);
                System.out.println("Gezegen: " + gezegenler.gezegenAdi + " || Güneşe Uzaklığı Sıra No: " + gezegenler.numara + " || Güneşe Uzaklığı: " + gezegenler.uzaklik + "  || Yarıçapı: " + gezegenler.yariCap + " || Dönme Süresi: " + gezegenler.donmeSuresi +" || Gün Uzunluğu: " + gezegenler.gunUzunlugu);
                System.out.println(ayrac);
                break;
        }
    }
}


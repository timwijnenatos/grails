package grails4app

class Gender extends Code {

    static final long serialVersionUID = 2853084828497246977L

    public static final String VEKTIS_CODE = "COD046"
    public static final String Male = "1"
    public static final String Female = "2"
    public static final String Unkown = "0"
    public static final String Not_Specified = "9"

    static mapping = {
        discriminator value: Gender.VEKTIS_CODE
    }

    Gender() {
        codelijstType = VEKTIS_CODE
    }

}

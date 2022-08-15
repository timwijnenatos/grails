package grails4app

class Code implements Serializable {

    static final long serialVersionUID = -5677068496838782383L

    String id
    String code
    String codelijstType

    static transients = [
            'id'
    ]

    static mapping = {
        table 'CodelijstWaardes'
        discriminator column: "codelijstType"
        id composite: ['code', 'codelijstType']
        cache true

        code column:'Code', insertable: false, updateable: false
        codelijstType column:'CodeLijstType', insertable: false, updateable: false
    }

    static constraints = {
        code nullable: false, maxSize: 30
        codelijstType nullable: false, maxSize: 6
    }

}

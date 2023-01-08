package transport;

public enum BodyType {

        TYP_SED("Седан"),
        TYP_HATCH("Хетчбек"),
        TYP_CUP("Купе"),
        TYP_UNIV("Универсал"),
        TYP_VNEDOR("Внедорожник"),
        TYP_CROS("Кроссовер"),
        TYPE_PICAP("Пикап"),
        TYPE_FURGON("Фургон"),
        TYPE_MINI("Минивен");
        public static BodyType findType(String type){
            for (BodyType typeBody : values()) {
                if (typeBody.getType().equals(type)) {
                    return typeBody;
                }
            }
            return null;
        }


        private final String type;

        BodyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return  type;
        }
    }


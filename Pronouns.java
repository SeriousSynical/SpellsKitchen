public enum Pronouns {

    masculine, feminine, nonBinary;

    public String subject() {

        String subject;

        if (this.equals(masculine)) {

            subject = "he";

        } else if (this.equals(feminine)) {

            subject = "she";

        } else {

            subject = "they";

        }

        return subject;

    }

    public String object() {

        String object;

        if (this.equals(masculine)) {

            object = "him";

        } else if (this.equals(feminine)) {

            object = "her";

        } else {

            object = "them";

        }

        return object;

    }

    public String possessive() {

        String possessive;

        if (this.equals(masculine)) {

            possessive = "his";

        } else if (this.equals(feminine)) {

            possessive = "hers";

        } else {

            possessive = "their";

        }

        return possessive;

    }

}
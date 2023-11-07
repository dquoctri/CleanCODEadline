package com.dqtri.clean.handbook.functions;

public class HaveNoSideEffects {
    class UserValidator {
        private Cryptographer cryptographer;

        public boolean checkPassword(String userName, String password) {
            User user = UserGateway.findByName(userName);
            if (user != User.NULL) {
                String codedPhrase = user.getPhraseEncodedByPassword();
                String phrase = cryptographer.decrypt(codedPhrase, password);
                if ("Valid Password".equals(phrase)) {
                    Session.initialize(); //???????????
                    return true;
                }
            }
            return false;
        }
    }






    class Cryptographer {
        String decrypt(String codedPhrase, String password) {
            return null;
        }
    }

    class UserGateway {
        static User findByName(String username) {
            return null;
        }
    }

    class User {
        static User NULL = null;

        String getPhraseEncodedByPassword() {
            return "";
        }
    }

    class Session {
        static void initialize() {

        }
    }
}

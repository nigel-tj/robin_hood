package com.campfiresolutions.robinhood.authenticator;

public interface LogoutService {
    void logout(Runnable onSuccess);
}

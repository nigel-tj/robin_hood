package com.campfiresolutions.robinhood;

import android.accounts.AccountsException;
import android.app.Activity;

import com.campfiresolutions.robinhood.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}

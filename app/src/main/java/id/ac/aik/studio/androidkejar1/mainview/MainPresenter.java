package id.ac.aik.studio.androidkejar1.mainview;

import android.text.TextUtils;

import id.ac.aik.studio.androidkejar1.maininteractor.InterfaceMain;
import id.ac.aik.studio.androidkejar1.maininteractor.InterfacePresenter;

/**
 * Created by Imam on 5/13/2017.
 */

public class MainPresenter  implements InterfacePresenter{

    private InterfaceMain mInterfaceMain;

    public MainPresenter(InterfaceMain mInterfaceMain) {
        this.mInterfaceMain = mInterfaceMain;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username)|| TextUtils.isEmpty(password)){
            mInterfaceMain.MessageError();
        } else {
            if (username.equals("imam")&&(password.equals("imam"))){
                mInterfaceMain.loginsucces();
            }else {
                mInterfaceMain.loginerror();
            }
        }
    }
}

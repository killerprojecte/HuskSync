package net.william278.husksync.util;

import net.william278.husksync.HuskSync;
import net.william278.husksync.data.DataSaveCause;
import net.william278.husksync.player.OnlineUser;

public class BackulUtil {
    public static void handleAutoBackup(HuskSync plugin,OnlineUser user){
       user.getUserData(plugin.getLoggingAdapter()).join().ifPresent(
                userData -> plugin.getDatabase().setUserData(user, userData, DataSaveCause.AUTO_BACKUP).join());
    }
}

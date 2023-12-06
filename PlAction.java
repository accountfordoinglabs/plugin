import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class PlAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        BrowserUtil.browse("https://calendar.yandex.ru/week?uid=1130000065043704");
        Messages.showMessageDialog("До Нового Года осталось совмем немного :)) ","Напоминание",Messages.getInformationIcon());
    }

}

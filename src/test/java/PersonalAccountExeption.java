import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.nio.channels.Selector.open;

/**
 * @author agorelikova
 * @since 19/10/2018
 */
public class PersonalAccountExeption {
  @Before
  public void setUpAccount() {
    Selenide.open("http://wildberries.ru");
    Configuration.timeout = 6000;
  }
@Ignore
  @Test
  public void EmailShouldBeUniqueness() {
    $(byText("Регистрация")).click();
    $("#Item_Email").setValue("ana-kucko@yandex.ru").pressEnter();
    $(byText("Такой email уже зарегистрирован")).shouldBe(Condition.visible);

  }
@Ignore
  @Test
  public void RegistrationNewEmail() {
    $(byText("Регистрация")).click();
    $("#Item_Email").setValue("ana-kucko@gmail.com").pressEnter();
    $(byText("Такой email уже зарегистрирован")).shouldNot(Condition.visible);

  }
@Ignore
  @Test
  public void NameShouldBeEnterRussianLettersOnly(){
    $(byText("Регистрация")).click();
    $("#Item_UserInfo_FirstName").setValue("Simon").pressEnter();
    $(byText("Некорректное имя")).shouldBe(Condition.visible);
  }

  @Test
  public void NameShouldBeEnterWithoutSymbols(){
    $(byText("Регистрация")).click();
    $("#Item_UserInfo_FirstName").setValue("123$%^").pressEnter();
    $(byText("Некорректное имя")).shouldBe(Condition.visible);
  }
}

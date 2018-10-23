import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author agorelikova
 * @since 18/09/2018
 */
public class PersonalAccount {
  @BeforeClass
  public static void setUp() {
    open("http://wildberries.ru");
    Configuration.timeout=6000;
  }
//@Ignore
//  @Test
//  public void userCanRegistration () {
//    $$(".user_menu li").get(0).click();
//    $(".auth-tabs-switch ").click();
//    $("#Item_Login").setValue("ana-kucko@yandex.ru");
//  }
//@Ignore
    @Test
    public void userCanEnterToAccountByEmail () {
      $$(".user_menu li").get(1).click();
      sleep(300);
      Selenide.switchTo().frame($("iframe"));
      $("#Item_Login").setValue("123");
      $("#Item_Password").setValue("scrabble");
    }
//@Ignore
//    @Test
//    public void userCanSearchBySite () {
//      $("#tbSrch").setValue("платье").pressEnter();
//      $(".active").shouldNot(Condition.empty);
//    }
//@Ignore
//    @Test
//    public void countItemOnPageShouldBe100 () {
//      $("#tbSrch").setValue("платье").pressEnter();
//      $$(".ref_goods_n_p").shouldHave(CollectionCondition.size(100));
//
//    }
  }

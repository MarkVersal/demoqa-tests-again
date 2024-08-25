import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");


        $("#userName").setValue("Mark Versal");
        $("#userEmail").setValue("MarkVersal@mail.ya");
        $("#currentAddress").setValue("Omsk");
        $("#permanentAddress").setValue("Omsk st.9 April H.4");
        $("#submit").click();
        $("#output").shouldHave(text("Mark Versal"), (text("MarkVersal@mail.ya")),
                (text("Omsk")), (text("Omsk st.9 April H.4")));
    }
}

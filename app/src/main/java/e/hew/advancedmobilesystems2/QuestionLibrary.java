package e.hew.advancedmobilesystems2;

public class QuestionLibrary {
    private String mQuestions [] = {
            "If you're making large interest payments on debt, it may make financial sense to transfer it all onto a credit card with a 0% balance transfer deal",
            "You can keep a hold of a bigger chunk of your earnings by claiming all the tax reliefs you're entitled to",
            "A quick browse of your monthly statement can help prevent any unnecessary payments lasting for months or even years",
            "Personal finance software can help you track where your money is going, making it easier to see where you can make potential savings",
            "Booking train tickets in advance could save you up to 87%.",
            "Adjusting your central heating timer to switch off at night and during the day if the house is empty will also minimise fuel consumptions",
            "Sign up for loyalty cards; Many cards offer one-off deals or discounts in order to tempt you into signing up in the first place"
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
}

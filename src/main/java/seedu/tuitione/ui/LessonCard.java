package seedu.tuitione.ui;

import static seedu.tuitione.model.lesson.LessonTime.TIME_FORMATTER;
import static seedu.tuitione.model.lesson.LessonTime.parseDayToString;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.tuitione.model.lesson.Lesson;

/**
 * An UI component that displays information of a {@code Lesson}
 */
public class LessonCard extends UiPart<Region> {

    private static final String FXML = "LessonListCard.fxml";
    private static final String STRING_FORMAT_SUBJECT = "📖\tSubject: \t%s";
    private static final String STRING_FORMAT_GRADE = "🔢\tGrade: \t\t%s";
    private static final String STRING_FORMAT_DAY = "📅\tDay: \t\t%s";
    private static final String STRING_FORMAT_TIME = "⏲\tTime: \t\t%s - %s";
    private static final String STRING_FORMAT_PRICE = "💱\tPrice: \t\t%s";
    private static final String STRING_FORMAT_SIZE = "😀\tSize: \t\t%d";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     *  or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on Tuitione level 4</a>
     */

    public final Lesson lesson;

    @FXML
    private HBox cardPane;
    @FXML
    private Label subject;
    @FXML
    private Label id;
    @FXML
    private Label grade;
    @FXML
    private Label dayOfWeek;
    @FXML
    private Label time;
    @FXML
    private Label endTime;
    @FXML
    private Label price;
    @FXML
    private Label lessonCode;
    @FXML
    private Label numOfStudentsEnrolled;

    /**
     * Creates a {@code LessonCode} with the given {@code Lesson} and index to display.
     */
    public LessonCard(Lesson lesson, int displayIndex) {
        super(FXML);
        this.lesson = lesson;
        id.setText(displayIndex + ". ");
        lessonCode.setText(lesson.getLessonCode().value);
        lessonCode.setUnderline(true);
        subject.setText(String.format(STRING_FORMAT_SUBJECT, lesson.getSubject()));
        grade.setText(String.format(STRING_FORMAT_GRADE, lesson.getGrade().value));
        dayOfWeek.setText(String.format(
                STRING_FORMAT_DAY,
                parseDayToString(lesson.getLessonTime().dayOfWeek)));
        time.setText(String.format(
                STRING_FORMAT_TIME,
                lesson.getLessonTime().startTime.format(TIME_FORMATTER),
                lesson.getLessonTime().endTime.format(TIME_FORMATTER)));
        price.setText(String.format(STRING_FORMAT_PRICE, lesson.getPrice().toString()));
        numOfStudentsEnrolled.setText(String.format(STRING_FORMAT_SIZE, lesson.getLessonSize()));
    }

    @Override
    public boolean equals(Object other) {
        //short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof LessonCard)) {
            return false;
        }

        // state check
        LessonCard card = (LessonCard) other;
        return id.getText().equals(card.id.getText())
                && lesson.equals(card.lesson);
    }


}

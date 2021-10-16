package seedu.tuitione.testutil;

import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_GRADE_AMY;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_GRADE_BOB;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.tuitione.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.tuitione.model.Tuitione;
import seedu.tuitione.model.student.Student;

/**
 * A utility class containing a list of {@code Student} objects to be used in tests.
 */
public class TypicalStudents {

    // Test Lessons, direct copy from json equivalent
    public static final Student ALICE = new StudentBuilder().withName("Alice Pauline")
            .withPhone("94351253").withEmail("alice@example.com")
            .withAddress("123, Jurong West Ave 6, #08-111").withGrade("P2").withTags("friends")
            .build();
    public static final Student BENSON = new StudentBuilder().withName("Benson Meier")
            .withPhone("98765432").withEmail("johnd@example.com")
            .withAddress("311, Clementi Ave 2, #02-25").withGrade("S2").withTags("owesMoney", "friends")
            .build();
    public static final Student CARL = new StudentBuilder().withName("Carl Kurz")
            .withPhone("95352563").withEmail("heinz@example.com")
            .withAddress("wall street").withGrade("P6")
            .build();
    public static final Student DANIEL = new StudentBuilder().withName("Daniel Meier")
            .withPhone("87652533").withEmail("cornelia@example.com")
            .withAddress("10th street").withGrade("S4").withTags("friends")
            .build();
    public static final Student ELLE = new StudentBuilder().withName("Elle Meyer")
            .withPhone("9482224").withEmail("werner@example.com")
            .withAddress("michegan ave").withGrade("S1")
            .build();
    public static final Student FIONA = new StudentBuilder().withName("Fiona Kunz")
            .withPhone("9482427").withEmail("lydia@example.com")
            .withAddress("little tokyo").withGrade("S2")
            .build();
    public static final Student GEORGE = new StudentBuilder().withName("George Best")
            .withPhone("9482442").withEmail("anna@example.com")
            .withAddress("4th street").withGrade("S3")
            .build();

    // Manually added
    public static final Student HOON = new StudentBuilder().withName("Hoon Meier")
            .withPhone("8482424").withEmail("stefan@example.com")
            .withAddress("little india").withGrade("P1")
            .build();
    public static final Student IDA = new StudentBuilder().withName("Ida Mueller")
            .withPhone("8482131").withEmail("hans@example.com")
            .withAddress("chicago ave").withGrade("P3")
            .build();

    // Manually added - Student's details found in {@code CommandTestUtil}
    public static final Student AMY = new StudentBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY)
            .withGrade(VALID_GRADE_AMY).withTags(VALID_TAG_FRIEND)
            .build();
    public static final Student BOB = new StudentBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB)
            .withGrade(VALID_GRADE_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalStudents() {} // prevents instantiation

    /**
     * Returns an {@code Tuitione} with all the typical students.
     */
    public static Tuitione getTypicalTuitione() {
        Tuitione ab = new Tuitione();
        for (Student student : getTypicalStudents()) {
            ab.addStudent(student);
        }
        return ab;
    }

    public static List<Student> getTypicalStudents() {
        return new ArrayList<>(Arrays.asList(ALICE.createClone(), BENSON.createClone(), CARL.createClone(),
                DANIEL.createClone(), ELLE.createClone(), FIONA.createClone(), GEORGE.createClone()));
    }
}
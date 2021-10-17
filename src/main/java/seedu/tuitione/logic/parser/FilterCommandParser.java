package seedu.tuitione.logic.parser;

import seedu.tuitione.logic.commands.FilterCommand;
import seedu.tuitione.logic.parser.exceptions.ParseException;
import seedu.tuitione.model.student.Grade;
import seedu.tuitione.model.student.IsSpecifiedGrade;


import static seedu.tuitione.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

/**
 * Parses input arguments and creates a new {@code FilterCommand} object.
 */
public class FilterCommandParser implements Parser<FilterCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the FilterCommand
     * and returns a FilterCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FilterCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, FilterCommand.MESSAGE_USAGE));
        }

        IsSpecifiedGrade gradeToFilter = new IsSpecifiedGrade(new Grade(trimmedArgs));

        return new FilterCommand(gradeToFilter);
    }
}

package mx.feliperomero.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    private static final String ORIGINAL_NOTE_COURSE_ID = "mx.feliperomero.ORIGINAL_NOTE_COURSE_ID";
    private static final String ORIGINAL_NOTE_TITLE = "mx.feliperomero.ORIGINAL_NOTE_TITLE";
    private static final String ORIGINAL_NOTE_TEXT = "mx.feliperomero.ORIGINAL_NOTE_TEXT";

    String mOriginalNoteCourseId;
    String mOriginalNoteTitle;
    String mOriginalNoteText;
    boolean mIsNewlyCreated = true;

    void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    void restoreState(Bundle inState) {
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TEXT);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TITLE);
    }
}

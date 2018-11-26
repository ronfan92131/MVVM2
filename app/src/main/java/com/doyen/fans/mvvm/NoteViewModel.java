package com.doyen.fans.mvvm;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import java.util.List;

public class NoteViewModel extends ViewModelProvider.AndroidViewModelFactory {
    private NoteRepository repository;
    private LiveData<List<Note>> allNotes;

    /**
     * Creates a {@code AndroidViewModelFactory}
     *
     * @param application an application to pass in {@link AndroidViewModel}
     */
    public NoteViewModel(@NonNull Application application) {
        super(application);

        repository = new NoteRepository(application);
        allNotes = repository.getAllNotes();
    }

    public void insert(Note note){
        repository.insert(note);
    }

    public void update(Note note){
        repository.update(note);
    }

    public void delete(Note note){
        repository.delete(note);
    }

    public void deleteAll(){
        repository.deleteAll();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }

}

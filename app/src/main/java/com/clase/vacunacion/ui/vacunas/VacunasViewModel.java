package com.clase.vacunacion.ui.vacunas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VacunasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VacunasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el fragment de vacunas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
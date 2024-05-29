package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.ActionRepository;
import com.digitalisation.ims.model.Action;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ActionService {
    private final ActionRepository actionRepository;
    public List<Action> getAllActions() {
        return actionRepository.findAll();
    }
}

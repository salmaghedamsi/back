package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.ActionRepository;
import com.digitalisation.ims.model.Action;
import com.digitalisation.ims.model.ims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ActionService {
    private final ActionRepository actionRepository;
    public List<Action> getAllActions() {
        return actionRepository.findAll();
    }
    public List<Action> saveAllActions(List<Action> actions) {
        return actionRepository.saveAll(actions);
    }
    public Action updateAction(Long id, Action actionDetails) {
        Optional<Action> optionalAction = actionRepository.findById(id);
        if (optionalAction.isPresent()) {
            Action action = optionalAction.get();
            action.setOui(actionDetails.getOui());
            action.setDetail(actionDetails.getDetail());
            action.setAttachement(actionDetails.getAttachement());
            action.setStatut(actionDetails.getStatut());
            action.setCommentaire(actionDetails.getCommentaire());
            return actionRepository.save(action);
        } else {
            throw new RuntimeException("Action not found with id " + id);
        }}
}

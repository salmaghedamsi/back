package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

}

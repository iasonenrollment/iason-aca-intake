package com.iason.aca.intake.web.model;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetadataDto
 * Inside the package - com.iason.aca.intake.web.model
 * Created Date: 5/6/2020
 * Created Time: 8:36 PM
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadataDto {

    private String sourceFileName;
    private UUID sourceFileId;
    private OffsetDateTime fileReceivedDateTime;
    private String fileStatus;
}

package com.tourism.impact.domain;

import com.tourism.config.AuditTrailLog;
import com.tourism.domain.BaseEntity;
import com.tourism.impact.domain.host.HostOpinion;
import com.tourism.impact.domain.host.HostTourismSector;
import com.tourism.impact.model.MaturityDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "host")
@SuperBuilder(toBuilder = true)
@EntityListeners(AuditTrailLog.class)
public class Host extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "data_treatment")
    private boolean dataTreatment;

    @Column(name = "tourist_accept")
    private String touristAccept;

    @Column(name = "suggestion")
    private String suggestion;

    @Column(name = "improvement")
    private String improvement;

    @Column(name = "lack")
    private String lack;

    @Column(name = "community_type_id")
    private String communityTypeId;

    @Column(name = "community_id")
    private UUID communityId;

    @Column(name = "municipality_id")
    private UUID municipalityId;

    @Column(name = "department_id")
    private UUID departmentId;

    @Transient
    private List<HostTourismSector> hostTourismSectorList;

    @Transient
    private List<HostOpinion> hostOpinionList;

    @Transient
    private MaturityDTO maturity;

    public List<HostOpinion> getHostOpinionList() {
        return hostOpinionList;
    }

    public void setHostOpinionList(List<HostOpinion> hostOpinionList) {
        this.hostOpinionList = hostOpinionList;
    }

    public String getLack() {
        return lack;
    }

    public void setLack(String lack) {
        this.lack = lack;
    }

    public List<HostTourismSector> getHostTourismSectorList() {
        return hostTourismSectorList;
    }

    public void setHostTourismSectorList(List<HostTourismSector> hostTourismSectorList) {
        this.hostTourismSectorList = hostTourismSectorList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDataTreatment() {
        return dataTreatment;
    }

    public void setDataTreatment(boolean dataTreatment) {
        this.dataTreatment = dataTreatment;
    }

    public String getTouristAccept() {
        return touristAccept;
    }

    public void setTouristAccept(String touristAccept) {
        this.touristAccept = touristAccept;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getImprovement() {
        return improvement;
    }

    public void setImprovement(String improvement) {
        this.improvement = improvement;
    }

    public UUID getCommunityId() {
        return communityId;
    }

    public void setCommunityId(UUID communityId) {
        this.communityId = communityId;
    }

    public String getCommunityTypeId() {
        return communityTypeId;
    }

    public void setCommunityTypeId(String communityTypeId) {
        this.communityTypeId = communityTypeId;
    }

    public UUID getMunicipalityId() {
        return municipalityId;
    }

    public void setMunicipalityId(UUID municipalityId) {
        this.municipalityId = municipalityId;
    }

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public MaturityDTO getMaturity() {
        return maturity;
    }

    public void setMaturity(MaturityDTO maturity) {
        this.maturity = maturity;
    }
}

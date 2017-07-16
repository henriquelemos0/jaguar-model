package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * This object represent the result of a Jaguar run.
 * It contains all the requirements with their respective suspicious value.
 *
 * Created by henrique on 7/16/17.
 */
public class FaultClassification {

    private String project;
    private String heuristic;
    private Requirement.Type requirementType;
    private Long timeSpent;

    private List<Requirement> requirements = new ArrayList<>();

    /**
     * Return a 'flat' list of {@link SuspiciousElement}.
     * If it has a specific structure, it will iterate over the sub elements.
     *
     * @return A 'flat' list of {@link SuspiciousElement}
     */
    @XmlElement
    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    @XmlAttribute
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @XmlAttribute
    public String getHeuristic() {
        return heuristic;
    }

    public void setHeuristic(String heuristic) {
        this.heuristic = heuristic;
    }

    @XmlAttribute
    public Requirement.Type getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(Requirement.Type requirementType) {
        this.requirementType = requirementType;
    }

    @XmlAttribute
    public Long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Long timeSpent) {
        this.timeSpent = timeSpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FaultClassification that = (FaultClassification) o;

        if (project != null ? !project.equals(that.project) : that.project != null) return false;
        if (heuristic != null ? !heuristic.equals(that.heuristic) : that.heuristic != null) return false;
        if (requirementType != that.requirementType) return false;
        if (timeSpent != null ? !timeSpent.equals(that.timeSpent) : that.timeSpent != null) return false;
        return requirements != null ? requirements.equals(that.requirements) : that.requirements == null;
    }

    @Override
    public int hashCode() {
        int result = project != null ? project.hashCode() : 0;
        result = 31 * result + (heuristic != null ? heuristic.hashCode() : 0);
        result = 31 * result + (requirementType != null ? requirementType.hashCode() : 0);
        result = 31 * result + (timeSpent != null ? timeSpent.hashCode() : 0);
        result = 31 * result + (requirements != null ? requirements.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FaultClassification{" +
                "project='" + project + '\'' +
                ", heuristic='" + heuristic + '\'' +
                ", requirementType=" + requirementType +
                ", timeSpent=" + timeSpent +
                ", requirements=" + requirements +
                '}';
    }
}

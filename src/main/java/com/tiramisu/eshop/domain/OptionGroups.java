package com.tiramisu.eshop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lahcen on 4/5/17.
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "optiongroups")
public class OptionGroups {
    @Id
    @GeneratedValue
    @Column(name = "OptionGroupID")
    private int optionGroupId;
    
    @Column(name = "OptionGroupName")
    private String optionGroupName;

    @OneToMany(mappedBy = "optionGroupsByOptionGroupId")
    private List<Options> optionsByOptionGroupId;
}

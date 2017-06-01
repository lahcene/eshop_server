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
@Table(name = "options")
public class Options {
    @Id
    @GeneratedValue
    @Column(name = "OptionID")
    private int optionId;

    @Column(name = "OptionName")
    private String optionName;

    @ManyToOne
    @JoinColumn(name = "OptionGroupID", referencedColumnName = "OptionGroupID", nullable = false)
    private OptionGroups optionGroupsByOptionGroupId;

    @OneToMany(mappedBy = "optionsByOptionId")
    private List<ProductOptions> productOptionsByOptionId;
}

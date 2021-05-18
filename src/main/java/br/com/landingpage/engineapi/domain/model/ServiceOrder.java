package br.com.landingpage.engineapi.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@Entity
@Table(name = "USER")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICE_ORDER")
    private Long id;

    @Column(name = "DATE_SERVICE_ORDER")
    private LocalDateTime dateServiceOrder;

    @Column(name = "DEFECT")
    private Long defect;

    @Column(name = "EQUIPMENT")
    private Long equipment;

}

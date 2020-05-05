package cn.zouhd.mandarin_corpus.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "corpus.fangzhi")
public class Fangzhi {

    @Id
    Integer id;
    //TODO: 有待修改方志数据库
    @Column(name = "fangzhi")
    String name;
}

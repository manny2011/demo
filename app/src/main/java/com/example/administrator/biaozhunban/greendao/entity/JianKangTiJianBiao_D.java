package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 健康体检表 D （辅助检查）
 * *关联A表*
 */
@Entity
public class JianKangTiJianBiao_D {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jktj3_id;//
    @NotNull
    private String jktj_id;//健康体检表ID
    private String jktj3_xcg_xhdb;//血红蛋白
    private String jktj3_xcg_bxb;//白细胞
    private String jktj3_xcg_xxb;//血小板
    private String jktj3_xcg_other;//血常规其他
    private String jktj3_ncg_ndb;//尿蛋白
    private String jktj3_ncg_nt;//尿糖
    private String jktj3_ncg_ntt;//尿酮体
    private String jktj3_ncg_nqx;//尿潜血
    private String jktj3_ncg_other;//尿常规 其他
    private String jktj3_kfxt;//空腹血糖
    private String jktj3_kfxt1;//空腹血糖1
    private int jktj3_xdt;//心电图
    private String jktj3_xdt_ms;//心电图 描述
    private String jktj3_nwlbdb;//尿微量白蛋白
    private int jktj3_dbqx;//大便潜血
    private String jktj3_thxhdb;//糖化血红蛋白
    private int jktj3_yxgy;//乙型肝炎表面抗原
    private String jktj3_gan_xqgb;//血清谷丙转氨酶
    private String jktj3_gan_xqgc;//血清谷草转氨酶
    private String jktj3_gan_bdb;//白蛋白
    private String jktj3_gan_zdhs;//总胆红素
    private String jktj3_gan_zhdhs;//结合胆红素
    private String jktj3_sen_xqjg;//血清肌酐
    private String jktj3_sen_xnsd;//血尿素氮
    private String jktj3_sen_xj;//血钾浓度
    private String jktj3_sen_xn;//血钠浓度
    private String jktj3_xz_zdgc;//总胆固醇
    private String jktj3_xz_gysz;//甘油三酯
    private String jktj3_xz_dmd;//血清低密度脂蛋白
    private String jktj3_xz_gmd;//血清高密度脂蛋白
    private int jktj3_xb;//胸部X线片
    private String jktj3_xb_ms;//胸部X线片 描述
    private int jktj3_bc;//B超
    private String jktj3_bc_ms;//B超 描述
    private int jktj3_gj;//宫颈涂片
    private String jktj3_gj_ms;//宫颈涂片 描述
    private String jktj3_bz;//其他（备注）

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 292107121)
    public JianKangTiJianBiao_D(Long id, @NotNull String jktj3_id,
            @NotNull String jktj_id, String jktj3_xcg_xhdb, String jktj3_xcg_bxb,
            String jktj3_xcg_xxb, String jktj3_xcg_other, String jktj3_ncg_ndb,
            String jktj3_ncg_nt, String jktj3_ncg_ntt, String jktj3_ncg_nqx,
            String jktj3_ncg_other, String jktj3_kfxt, String jktj3_kfxt1,
            int jktj3_xdt, String jktj3_xdt_ms, String jktj3_nwlbdb, int jktj3_dbqx,
            String jktj3_thxhdb, int jktj3_yxgy, String jktj3_gan_xqgb,
            String jktj3_gan_xqgc, String jktj3_gan_bdb, String jktj3_gan_zdhs,
            String jktj3_gan_zhdhs, String jktj3_sen_xqjg, String jktj3_sen_xnsd,
            String jktj3_sen_xj, String jktj3_sen_xn, String jktj3_xz_zdgc,
            String jktj3_xz_gysz, String jktj3_xz_dmd, String jktj3_xz_gmd,
            int jktj3_xb, String jktj3_xb_ms, int jktj3_bc, String jktj3_bc_ms,
            int jktj3_gj, String jktj3_gj_ms, String jktj3_bz, String createDate) {
        this.id = id;
        this.jktj3_id = jktj3_id;
        this.jktj_id = jktj_id;
        this.jktj3_xcg_xhdb = jktj3_xcg_xhdb;
        this.jktj3_xcg_bxb = jktj3_xcg_bxb;
        this.jktj3_xcg_xxb = jktj3_xcg_xxb;
        this.jktj3_xcg_other = jktj3_xcg_other;
        this.jktj3_ncg_ndb = jktj3_ncg_ndb;
        this.jktj3_ncg_nt = jktj3_ncg_nt;
        this.jktj3_ncg_ntt = jktj3_ncg_ntt;
        this.jktj3_ncg_nqx = jktj3_ncg_nqx;
        this.jktj3_ncg_other = jktj3_ncg_other;
        this.jktj3_kfxt = jktj3_kfxt;
        this.jktj3_kfxt1 = jktj3_kfxt1;
        this.jktj3_xdt = jktj3_xdt;
        this.jktj3_xdt_ms = jktj3_xdt_ms;
        this.jktj3_nwlbdb = jktj3_nwlbdb;
        this.jktj3_dbqx = jktj3_dbqx;
        this.jktj3_thxhdb = jktj3_thxhdb;
        this.jktj3_yxgy = jktj3_yxgy;
        this.jktj3_gan_xqgb = jktj3_gan_xqgb;
        this.jktj3_gan_xqgc = jktj3_gan_xqgc;
        this.jktj3_gan_bdb = jktj3_gan_bdb;
        this.jktj3_gan_zdhs = jktj3_gan_zdhs;
        this.jktj3_gan_zhdhs = jktj3_gan_zhdhs;
        this.jktj3_sen_xqjg = jktj3_sen_xqjg;
        this.jktj3_sen_xnsd = jktj3_sen_xnsd;
        this.jktj3_sen_xj = jktj3_sen_xj;
        this.jktj3_sen_xn = jktj3_sen_xn;
        this.jktj3_xz_zdgc = jktj3_xz_zdgc;
        this.jktj3_xz_gysz = jktj3_xz_gysz;
        this.jktj3_xz_dmd = jktj3_xz_dmd;
        this.jktj3_xz_gmd = jktj3_xz_gmd;
        this.jktj3_xb = jktj3_xb;
        this.jktj3_xb_ms = jktj3_xb_ms;
        this.jktj3_bc = jktj3_bc;
        this.jktj3_bc_ms = jktj3_bc_ms;
        this.jktj3_gj = jktj3_gj;
        this.jktj3_gj_ms = jktj3_gj_ms;
        this.jktj3_bz = jktj3_bz;
        this.createDate = createDate;
    }
    @Generated(hash = 1424706285)
    public JianKangTiJianBiao_D() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJktj3_id() {
        return this.jktj3_id;
    }
    public void setJktj3_id(String jktj3_id) {
        this.jktj3_id = jktj3_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public String getJktj3_xcg_xhdb() {
        return this.jktj3_xcg_xhdb;
    }
    public void setJktj3_xcg_xhdb(String jktj3_xcg_xhdb) {
        this.jktj3_xcg_xhdb = jktj3_xcg_xhdb;
    }
    public String getJktj3_xcg_bxb() {
        return this.jktj3_xcg_bxb;
    }
    public void setJktj3_xcg_bxb(String jktj3_xcg_bxb) {
        this.jktj3_xcg_bxb = jktj3_xcg_bxb;
    }
    public String getJktj3_xcg_xxb() {
        return this.jktj3_xcg_xxb;
    }
    public void setJktj3_xcg_xxb(String jktj3_xcg_xxb) {
        this.jktj3_xcg_xxb = jktj3_xcg_xxb;
    }
    public String getJktj3_xcg_other() {
        return this.jktj3_xcg_other;
    }
    public void setJktj3_xcg_other(String jktj3_xcg_other) {
        this.jktj3_xcg_other = jktj3_xcg_other;
    }
    public String getJktj3_ncg_ndb() {
        return this.jktj3_ncg_ndb;
    }
    public void setJktj3_ncg_ndb(String jktj3_ncg_ndb) {
        this.jktj3_ncg_ndb = jktj3_ncg_ndb;
    }
    public String getJktj3_ncg_nt() {
        return this.jktj3_ncg_nt;
    }
    public void setJktj3_ncg_nt(String jktj3_ncg_nt) {
        this.jktj3_ncg_nt = jktj3_ncg_nt;
    }
    public String getJktj3_ncg_ntt() {
        return this.jktj3_ncg_ntt;
    }
    public void setJktj3_ncg_ntt(String jktj3_ncg_ntt) {
        this.jktj3_ncg_ntt = jktj3_ncg_ntt;
    }
    public String getJktj3_ncg_nqx() {
        return this.jktj3_ncg_nqx;
    }
    public void setJktj3_ncg_nqx(String jktj3_ncg_nqx) {
        this.jktj3_ncg_nqx = jktj3_ncg_nqx;
    }
    public String getJktj3_ncg_other() {
        return this.jktj3_ncg_other;
    }
    public void setJktj3_ncg_other(String jktj3_ncg_other) {
        this.jktj3_ncg_other = jktj3_ncg_other;
    }
    public String getJktj3_kfxt() {
        return this.jktj3_kfxt;
    }
    public void setJktj3_kfxt(String jktj3_kfxt) {
        this.jktj3_kfxt = jktj3_kfxt;
    }
    public String getJktj3_kfxt1() {
        return this.jktj3_kfxt1;
    }
    public void setJktj3_kfxt1(String jktj3_kfxt1) {
        this.jktj3_kfxt1 = jktj3_kfxt1;
    }
    public int getJktj3_xdt() {
        return this.jktj3_xdt;
    }
    public void setJktj3_xdt(int jktj3_xdt) {
        this.jktj3_xdt = jktj3_xdt;
    }
    public String getJktj3_xdt_ms() {
        return this.jktj3_xdt_ms;
    }
    public void setJktj3_xdt_ms(String jktj3_xdt_ms) {
        this.jktj3_xdt_ms = jktj3_xdt_ms;
    }
    public String getJktj3_nwlbdb() {
        return this.jktj3_nwlbdb;
    }
    public void setJktj3_nwlbdb(String jktj3_nwlbdb) {
        this.jktj3_nwlbdb = jktj3_nwlbdb;
    }
    public int getJktj3_dbqx() {
        return this.jktj3_dbqx;
    }
    public void setJktj3_dbqx(int jktj3_dbqx) {
        this.jktj3_dbqx = jktj3_dbqx;
    }
    public String getJktj3_thxhdb() {
        return this.jktj3_thxhdb;
    }
    public void setJktj3_thxhdb(String jktj3_thxhdb) {
        this.jktj3_thxhdb = jktj3_thxhdb;
    }
    public int getJktj3_yxgy() {
        return this.jktj3_yxgy;
    }
    public void setJktj3_yxgy(int jktj3_yxgy) {
        this.jktj3_yxgy = jktj3_yxgy;
    }
    public String getJktj3_gan_xqgb() {
        return this.jktj3_gan_xqgb;
    }
    public void setJktj3_gan_xqgb(String jktj3_gan_xqgb) {
        this.jktj3_gan_xqgb = jktj3_gan_xqgb;
    }
    public String getJktj3_gan_xqgc() {
        return this.jktj3_gan_xqgc;
    }
    public void setJktj3_gan_xqgc(String jktj3_gan_xqgc) {
        this.jktj3_gan_xqgc = jktj3_gan_xqgc;
    }
    public String getJktj3_gan_bdb() {
        return this.jktj3_gan_bdb;
    }
    public void setJktj3_gan_bdb(String jktj3_gan_bdb) {
        this.jktj3_gan_bdb = jktj3_gan_bdb;
    }
    public String getJktj3_gan_zdhs() {
        return this.jktj3_gan_zdhs;
    }
    public void setJktj3_gan_zdhs(String jktj3_gan_zdhs) {
        this.jktj3_gan_zdhs = jktj3_gan_zdhs;
    }
    public String getJktj3_gan_zhdhs() {
        return this.jktj3_gan_zhdhs;
    }
    public void setJktj3_gan_zhdhs(String jktj3_gan_zhdhs) {
        this.jktj3_gan_zhdhs = jktj3_gan_zhdhs;
    }
    public String getJktj3_sen_xqjg() {
        return this.jktj3_sen_xqjg;
    }
    public void setJktj3_sen_xqjg(String jktj3_sen_xqjg) {
        this.jktj3_sen_xqjg = jktj3_sen_xqjg;
    }
    public String getJktj3_sen_xnsd() {
        return this.jktj3_sen_xnsd;
    }
    public void setJktj3_sen_xnsd(String jktj3_sen_xnsd) {
        this.jktj3_sen_xnsd = jktj3_sen_xnsd;
    }
    public String getJktj3_sen_xj() {
        return this.jktj3_sen_xj;
    }
    public void setJktj3_sen_xj(String jktj3_sen_xj) {
        this.jktj3_sen_xj = jktj3_sen_xj;
    }
    public String getJktj3_sen_xn() {
        return this.jktj3_sen_xn;
    }
    public void setJktj3_sen_xn(String jktj3_sen_xn) {
        this.jktj3_sen_xn = jktj3_sen_xn;
    }
    public String getJktj3_xz_zdgc() {
        return this.jktj3_xz_zdgc;
    }
    public void setJktj3_xz_zdgc(String jktj3_xz_zdgc) {
        this.jktj3_xz_zdgc = jktj3_xz_zdgc;
    }
    public String getJktj3_xz_gysz() {
        return this.jktj3_xz_gysz;
    }
    public void setJktj3_xz_gysz(String jktj3_xz_gysz) {
        this.jktj3_xz_gysz = jktj3_xz_gysz;
    }
    public String getJktj3_xz_dmd() {
        return this.jktj3_xz_dmd;
    }
    public void setJktj3_xz_dmd(String jktj3_xz_dmd) {
        this.jktj3_xz_dmd = jktj3_xz_dmd;
    }
    public String getJktj3_xz_gmd() {
        return this.jktj3_xz_gmd;
    }
    public void setJktj3_xz_gmd(String jktj3_xz_gmd) {
        this.jktj3_xz_gmd = jktj3_xz_gmd;
    }
    public int getJktj3_xb() {
        return this.jktj3_xb;
    }
    public void setJktj3_xb(int jktj3_xb) {
        this.jktj3_xb = jktj3_xb;
    }
    public String getJktj3_xb_ms() {
        return this.jktj3_xb_ms;
    }
    public void setJktj3_xb_ms(String jktj3_xb_ms) {
        this.jktj3_xb_ms = jktj3_xb_ms;
    }
    public int getJktj3_bc() {
        return this.jktj3_bc;
    }
    public void setJktj3_bc(int jktj3_bc) {
        this.jktj3_bc = jktj3_bc;
    }
    public String getJktj3_bc_ms() {
        return this.jktj3_bc_ms;
    }
    public void setJktj3_bc_ms(String jktj3_bc_ms) {
        this.jktj3_bc_ms = jktj3_bc_ms;
    }
    public int getJktj3_gj() {
        return this.jktj3_gj;
    }
    public void setJktj3_gj(int jktj3_gj) {
        this.jktj3_gj = jktj3_gj;
    }
    public String getJktj3_gj_ms() {
        return this.jktj3_gj_ms;
    }
    public void setJktj3_gj_ms(String jktj3_gj_ms) {
        this.jktj3_gj_ms = jktj3_gj_ms;
    }
    public String getJktj3_bz() {
        return this.jktj3_bz;
    }
    public void setJktj3_bz(String jktj3_bz) {
        this.jktj3_bz = jktj3_bz;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 健康体检表B   （脏器功能、查体)
 * **主表为A表**
 */
@Entity
public class JianKangTiJianBiao_B {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jktj1_id;
    @NotNull
    private String jktj_id;//健康体检表A(主表)ID
    private int jktj1_kouc;//口唇
    private int jktj1_chil;//齿列
    private String jktj1_quec;//缺齿
    private String jktj1_quc;//龋齿
    private String jktj1_yic;//义齿
    private int jktj1_yanb;//咽部
    private String jktj1_slz;//视力左眼
    private String jktj1_sly;//视力右眼
    private String jktj1_jzslz;//矫正视力 左眼
    private String jktj1_jzsly;//矫正视力 右眼
    private int jktj1_tingl;//听力
    private int jktj1_ydgn;//运动功能
    private int jktj1_yd;//查体------眼底 0正常， 1异常
    private String jktj1_yd_ms;//眼底 描述
    private int jktj1_pif;//皮肤
    private int jktj1_gongm;//巩膜
    private int jktj1_linbj;//淋巴结
    private int jktj1_tongzx;//肺------桶状胸 0否， 1是
    private int jktj1_huxy;//呼吸音  0正常， 1异常
    private String jktj1_huxy_ms;//呼吸音 描述
    private int jktj1_luoy;//罗音
    private String jktj1_xinl;//心脏------心率  次/分钟
    private int jktj1_xinlv;//心律
    private int jktj1_zay;//杂音 0无， 1有
    private String jktj1_zay_ms;//杂音 描述
    private int jktj1_yat;//腹部------压痛 0无 ，1有
    private String jktj1_yat_ms;//腹部------压痛 描述
    private int jktj1_baok;//包块 0无 ，1有
    private String jktj1_baok_ms;//包块 描述
    private int jktj1_gand;//肝大 0无 ，1有
    private String jktj1_gand_ms;//肝大 描述
    private int jktj1_pid;//脾大 0无 ，1有
    private String jktj1_pid_ms;//脾大 描述
    private int jktj1_zhuoy;//移动性浊音 0无 ，1有
    private String jktj1_zhuoy_ms;//移动性浊音 描述
    private int jktj1_xzsz;//下肢水肿
    private int jktj1_zbdmbd;//足背动脉博动
    private int jktj1_gmzz;//肛门指诊
    private int jktj1_rux;//乳腺
    private int jktj1_waiy;//妇科------外阴 0未见异常， 1异常
    private String jktj1_waiy_ms;//妇科------外阴 描述
    private int jktj1_yind;//阴道 0未见异常， 1异常
    private String jktj1_yind_ms;//阴道 描述
    private int jktj1_gongj;//宫颈 0未见异常， 1异常
    private String jktj1_gongj_ms;//宫颈 描述
    private int jktj1_gongt;//宫体 0未见异常， 1异常
    private String jktj1_gongt_ms;//宫体 描述
    private int jktj1_fuj;//附件 0未见异常， 1异常
    private String jktj1_fuj_ms;//附件 描述
    private String jktj1_bz;//其他（备注）

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;


    @Generated(hash = 1879969051)
    public JianKangTiJianBiao_B(Long id, @NotNull String jktj1_id,
            @NotNull String jktj_id, int jktj1_kouc, int jktj1_chil,
            String jktj1_quec, String jktj1_quc, String jktj1_yic, int jktj1_yanb,
            String jktj1_slz, String jktj1_sly, String jktj1_jzslz,
            String jktj1_jzsly, int jktj1_tingl, int jktj1_ydgn, int jktj1_yd,
            String jktj1_yd_ms, int jktj1_pif, int jktj1_gongm, int jktj1_linbj,
            int jktj1_tongzx, int jktj1_huxy, String jktj1_huxy_ms, int jktj1_luoy,
            String jktj1_xinl, int jktj1_xinlv, int jktj1_zay, String jktj1_zay_ms,
            int jktj1_yat, String jktj1_yat_ms, int jktj1_baok,
            String jktj1_baok_ms, int jktj1_gand, String jktj1_gand_ms,
            int jktj1_pid, String jktj1_pid_ms, int jktj1_zhuoy,
            String jktj1_zhuoy_ms, int jktj1_xzsz, int jktj1_zbdmbd, int jktj1_gmzz,
            int jktj1_rux, int jktj1_waiy, String jktj1_waiy_ms, int jktj1_yind,
            String jktj1_yind_ms, int jktj1_gongj, String jktj1_gongj_ms,
            int jktj1_gongt, String jktj1_gongt_ms, int jktj1_fuj,
            String jktj1_fuj_ms, String jktj1_bz, String createDate) {
        this.id = id;
        this.jktj1_id = jktj1_id;
        this.jktj_id = jktj_id;
        this.jktj1_kouc = jktj1_kouc;
        this.jktj1_chil = jktj1_chil;
        this.jktj1_quec = jktj1_quec;
        this.jktj1_quc = jktj1_quc;
        this.jktj1_yic = jktj1_yic;
        this.jktj1_yanb = jktj1_yanb;
        this.jktj1_slz = jktj1_slz;
        this.jktj1_sly = jktj1_sly;
        this.jktj1_jzslz = jktj1_jzslz;
        this.jktj1_jzsly = jktj1_jzsly;
        this.jktj1_tingl = jktj1_tingl;
        this.jktj1_ydgn = jktj1_ydgn;
        this.jktj1_yd = jktj1_yd;
        this.jktj1_yd_ms = jktj1_yd_ms;
        this.jktj1_pif = jktj1_pif;
        this.jktj1_gongm = jktj1_gongm;
        this.jktj1_linbj = jktj1_linbj;
        this.jktj1_tongzx = jktj1_tongzx;
        this.jktj1_huxy = jktj1_huxy;
        this.jktj1_huxy_ms = jktj1_huxy_ms;
        this.jktj1_luoy = jktj1_luoy;
        this.jktj1_xinl = jktj1_xinl;
        this.jktj1_xinlv = jktj1_xinlv;
        this.jktj1_zay = jktj1_zay;
        this.jktj1_zay_ms = jktj1_zay_ms;
        this.jktj1_yat = jktj1_yat;
        this.jktj1_yat_ms = jktj1_yat_ms;
        this.jktj1_baok = jktj1_baok;
        this.jktj1_baok_ms = jktj1_baok_ms;
        this.jktj1_gand = jktj1_gand;
        this.jktj1_gand_ms = jktj1_gand_ms;
        this.jktj1_pid = jktj1_pid;
        this.jktj1_pid_ms = jktj1_pid_ms;
        this.jktj1_zhuoy = jktj1_zhuoy;
        this.jktj1_zhuoy_ms = jktj1_zhuoy_ms;
        this.jktj1_xzsz = jktj1_xzsz;
        this.jktj1_zbdmbd = jktj1_zbdmbd;
        this.jktj1_gmzz = jktj1_gmzz;
        this.jktj1_rux = jktj1_rux;
        this.jktj1_waiy = jktj1_waiy;
        this.jktj1_waiy_ms = jktj1_waiy_ms;
        this.jktj1_yind = jktj1_yind;
        this.jktj1_yind_ms = jktj1_yind_ms;
        this.jktj1_gongj = jktj1_gongj;
        this.jktj1_gongj_ms = jktj1_gongj_ms;
        this.jktj1_gongt = jktj1_gongt;
        this.jktj1_gongt_ms = jktj1_gongt_ms;
        this.jktj1_fuj = jktj1_fuj;
        this.jktj1_fuj_ms = jktj1_fuj_ms;
        this.jktj1_bz = jktj1_bz;
        this.createDate = createDate;
    }
    @Generated(hash = 1807883641)
    public JianKangTiJianBiao_B() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJktj1_id() {
        return this.jktj1_id;
    }
    public void setJktj1_id(String jktj1_id) {
        this.jktj1_id = jktj1_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public int getJktj1_kouc() {
        return this.jktj1_kouc;
    }
    public void setJktj1_kouc(int jktj1_kouc) {
        this.jktj1_kouc = jktj1_kouc;
    }
    public int getJktj1_chil() {
        return this.jktj1_chil;
    }
    public void setJktj1_chil(int jktj1_chil) {
        this.jktj1_chil = jktj1_chil;
    }
    public String getJktj1_quec() {
        return this.jktj1_quec;
    }
    public void setJktj1_quec(String jktj1_quec) {
        this.jktj1_quec = jktj1_quec;
    }
    public String getJktj1_quc() {
        return this.jktj1_quc;
    }
    public void setJktj1_quc(String jktj1_quc) {
        this.jktj1_quc = jktj1_quc;
    }
    public String getJktj1_yic() {
        return this.jktj1_yic;
    }
    public void setJktj1_yic(String jktj1_yic) {
        this.jktj1_yic = jktj1_yic;
    }
    public int getJktj1_yanb() {
        return this.jktj1_yanb;
    }
    public void setJktj1_yanb(int jktj1_yanb) {
        this.jktj1_yanb = jktj1_yanb;
    }
    public String getJktj1_slz() {
        return this.jktj1_slz;
    }
    public void setJktj1_slz(String jktj1_slz) {
        this.jktj1_slz = jktj1_slz;
    }
    public String getJktj1_sly() {
        return this.jktj1_sly;
    }
    public void setJktj1_sly(String jktj1_sly) {
        this.jktj1_sly = jktj1_sly;
    }
    public String getJktj1_jzslz() {
        return this.jktj1_jzslz;
    }
    public void setJktj1_jzslz(String jktj1_jzslz) {
        this.jktj1_jzslz = jktj1_jzslz;
    }
    public String getJktj1_jzsly() {
        return this.jktj1_jzsly;
    }
    public void setJktj1_jzsly(String jktj1_jzsly) {
        this.jktj1_jzsly = jktj1_jzsly;
    }
    public int getJktj1_tingl() {
        return this.jktj1_tingl;
    }
    public void setJktj1_tingl(int jktj1_tingl) {
        this.jktj1_tingl = jktj1_tingl;
    }
    public int getJktj1_ydgn() {
        return this.jktj1_ydgn;
    }
    public void setJktj1_ydgn(int jktj1_ydgn) {
        this.jktj1_ydgn = jktj1_ydgn;
    }
    public int getJktj1_yd() {
        return this.jktj1_yd;
    }
    public void setJktj1_yd(int jktj1_yd) {
        this.jktj1_yd = jktj1_yd;
    }
    public String getJktj1_yd_ms() {
        return this.jktj1_yd_ms;
    }
    public void setJktj1_yd_ms(String jktj1_yd_ms) {
        this.jktj1_yd_ms = jktj1_yd_ms;
    }
    public int getJktj1_pif() {
        return this.jktj1_pif;
    }
    public void setJktj1_pif(int jktj1_pif) {
        this.jktj1_pif = jktj1_pif;
    }
    public int getJktj1_gongm() {
        return this.jktj1_gongm;
    }
    public void setJktj1_gongm(int jktj1_gongm) {
        this.jktj1_gongm = jktj1_gongm;
    }
    public int getJktj1_linbj() {
        return this.jktj1_linbj;
    }
    public void setJktj1_linbj(int jktj1_linbj) {
        this.jktj1_linbj = jktj1_linbj;
    }
    public int getJktj1_tongzx() {
        return this.jktj1_tongzx;
    }
    public void setJktj1_tongzx(int jktj1_tongzx) {
        this.jktj1_tongzx = jktj1_tongzx;
    }
    public int getJktj1_huxy() {
        return this.jktj1_huxy;
    }
    public void setJktj1_huxy(int jktj1_huxy) {
        this.jktj1_huxy = jktj1_huxy;
    }
    public String getJktj1_huxy_ms() {
        return this.jktj1_huxy_ms;
    }
    public void setJktj1_huxy_ms(String jktj1_huxy_ms) {
        this.jktj1_huxy_ms = jktj1_huxy_ms;
    }
    public int getJktj1_luoy() {
        return this.jktj1_luoy;
    }
    public void setJktj1_luoy(int jktj1_luoy) {
        this.jktj1_luoy = jktj1_luoy;
    }
    public String getJktj1_xinl() {
        return this.jktj1_xinl;
    }
    public void setJktj1_xinl(String jktj1_xinl) {
        this.jktj1_xinl = jktj1_xinl;
    }
    public int getJktj1_xinlv() {
        return this.jktj1_xinlv;
    }
    public void setJktj1_xinlv(int jktj1_xinlv) {
        this.jktj1_xinlv = jktj1_xinlv;
    }
    public int getJktj1_zay() {
        return this.jktj1_zay;
    }
    public void setJktj1_zay(int jktj1_zay) {
        this.jktj1_zay = jktj1_zay;
    }
    public String getJktj1_zay_ms() {
        return this.jktj1_zay_ms;
    }
    public void setJktj1_zay_ms(String jktj1_zay_ms) {
        this.jktj1_zay_ms = jktj1_zay_ms;
    }
    public int getJktj1_yat() {
        return this.jktj1_yat;
    }
    public void setJktj1_yat(int jktj1_yat) {
        this.jktj1_yat = jktj1_yat;
    }
    public String getJktj1_yat_ms() {
        return this.jktj1_yat_ms;
    }
    public void setJktj1_yat_ms(String jktj1_yat_ms) {
        this.jktj1_yat_ms = jktj1_yat_ms;
    }
    public int getJktj1_baok() {
        return this.jktj1_baok;
    }
    public void setJktj1_baok(int jktj1_baok) {
        this.jktj1_baok = jktj1_baok;
    }
    public String getJktj1_baok_ms() {
        return this.jktj1_baok_ms;
    }
    public void setJktj1_baok_ms(String jktj1_baok_ms) {
        this.jktj1_baok_ms = jktj1_baok_ms;
    }
    public int getJktj1_gand() {
        return this.jktj1_gand;
    }
    public void setJktj1_gand(int jktj1_gand) {
        this.jktj1_gand = jktj1_gand;
    }
    public String getJktj1_gand_ms() {
        return this.jktj1_gand_ms;
    }
    public void setJktj1_gand_ms(String jktj1_gand_ms) {
        this.jktj1_gand_ms = jktj1_gand_ms;
    }
    public int getJktj1_pid() {
        return this.jktj1_pid;
    }
    public void setJktj1_pid(int jktj1_pid) {
        this.jktj1_pid = jktj1_pid;
    }
    public String getJktj1_pid_ms() {
        return this.jktj1_pid_ms;
    }
    public void setJktj1_pid_ms(String jktj1_pid_ms) {
        this.jktj1_pid_ms = jktj1_pid_ms;
    }
    public int getJktj1_zhuoy() {
        return this.jktj1_zhuoy;
    }
    public void setJktj1_zhuoy(int jktj1_zhuoy) {
        this.jktj1_zhuoy = jktj1_zhuoy;
    }
    public String getJktj1_zhuoy_ms() {
        return this.jktj1_zhuoy_ms;
    }
    public void setJktj1_zhuoy_ms(String jktj1_zhuoy_ms) {
        this.jktj1_zhuoy_ms = jktj1_zhuoy_ms;
    }
    public int getJktj1_xzsz() {
        return this.jktj1_xzsz;
    }
    public void setJktj1_xzsz(int jktj1_xzsz) {
        this.jktj1_xzsz = jktj1_xzsz;
    }
    public int getJktj1_zbdmbd() {
        return this.jktj1_zbdmbd;
    }
    public void setJktj1_zbdmbd(int jktj1_zbdmbd) {
        this.jktj1_zbdmbd = jktj1_zbdmbd;
    }
    public int getJktj1_gmzz() {
        return this.jktj1_gmzz;
    }
    public void setJktj1_gmzz(int jktj1_gmzz) {
        this.jktj1_gmzz = jktj1_gmzz;
    }
    public int getJktj1_rux() {
        return this.jktj1_rux;
    }
    public void setJktj1_rux(int jktj1_rux) {
        this.jktj1_rux = jktj1_rux;
    }
    public int getJktj1_waiy() {
        return this.jktj1_waiy;
    }
    public void setJktj1_waiy(int jktj1_waiy) {
        this.jktj1_waiy = jktj1_waiy;
    }
    public String getJktj1_waiy_ms() {
        return this.jktj1_waiy_ms;
    }
    public void setJktj1_waiy_ms(String jktj1_waiy_ms) {
        this.jktj1_waiy_ms = jktj1_waiy_ms;
    }
    public int getJktj1_yind() {
        return this.jktj1_yind;
    }
    public void setJktj1_yind(int jktj1_yind) {
        this.jktj1_yind = jktj1_yind;
    }
    public String getJktj1_yind_ms() {
        return this.jktj1_yind_ms;
    }
    public void setJktj1_yind_ms(String jktj1_yind_ms) {
        this.jktj1_yind_ms = jktj1_yind_ms;
    }
    public int getJktj1_gongj() {
        return this.jktj1_gongj;
    }
    public void setJktj1_gongj(int jktj1_gongj) {
        this.jktj1_gongj = jktj1_gongj;
    }
    public String getJktj1_gongj_ms() {
        return this.jktj1_gongj_ms;
    }
    public void setJktj1_gongj_ms(String jktj1_gongj_ms) {
        this.jktj1_gongj_ms = jktj1_gongj_ms;
    }
    public int getJktj1_gongt() {
        return this.jktj1_gongt;
    }
    public void setJktj1_gongt(int jktj1_gongt) {
        this.jktj1_gongt = jktj1_gongt;
    }
    public String getJktj1_gongt_ms() {
        return this.jktj1_gongt_ms;
    }
    public void setJktj1_gongt_ms(String jktj1_gongt_ms) {
        this.jktj1_gongt_ms = jktj1_gongt_ms;
    }
    public int getJktj1_fuj() {
        return this.jktj1_fuj;
    }
    public void setJktj1_fuj(int jktj1_fuj) {
        this.jktj1_fuj = jktj1_fuj;
    }
    public String getJktj1_fuj_ms() {
        return this.jktj1_fuj_ms;
    }
    public void setJktj1_fuj_ms(String jktj1_fuj_ms) {
        this.jktj1_fuj_ms = jktj1_fuj_ms;
    }
    public String getJktj1_bz() {
        return this.jktj1_bz;
    }
    public void setJktj1_bz(String jktj1_bz) {
        this.jktj1_bz = jktj1_bz;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

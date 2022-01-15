package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Kurakura;
import simple.example.hewanpedia.model.Kurakura;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.anggora_nama),ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi),R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama),ctx.getString(R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama),ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama),ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama),ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi) , R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama),ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }


    private static List<Kurakura> initDataKurakura(Context ctx) {
        List<Kurakura> kurakuras = new ArrayList<>();
        kurakuras.add(new Kurakura(ctx.getString(R.string.cherry_head_nama),ctx.getString(R.string.cherry_head_asal),
                ctx.getString(R.string.cherry_head_deskripsi), R.drawable.kura_cherry_head));
        kurakuras.add(new Kurakura(ctx.getString(R.string.forsteni_nama),ctx.getString(R.string.forsteni_asal),
                ctx.getString(R.string.forsteni_deskripsi), R.drawable.kura_forsteni));
        kurakuras.add(new Kurakura(ctx.getString(R.string.leopard_nama),ctx.getString(R.string.leopard_asal),
                ctx.getString(R.string.leopard_deskripsi), R.drawable.kura_leopard));
        kurakuras.add(new Kurakura(ctx.getString(R.string.sulcata_nama),ctx.getString(R.string.sulcata_asal),
                ctx.getString(R.string.sulcata_deskripsi), R.drawable.kura_sulcata));
        kurakuras.add(new Kurakura(ctx.getString(R.string.aligator_nama),ctx.getString(R.string.aligator_asal),
                ctx.getString(R.string.aligator_deskripsi), R.drawable.kura_aligator));
        kurakuras.add(new Kurakura(ctx.getString(R.string.indian_nama),ctx.getString(R.string.indian_asal),
                ctx.getString(R.string.indian_deskripsi), R.drawable.kura_indian));
        return kurakuras;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.netherland_dwarf_nama),ctx.getString(R.string.netherland_dwarf_asal),
                ctx.getString(R.string.netherland_dwarf_diskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.orictolagus_cuniculus_nama),ctx.getString(R.string.orictolagus_cuniculus_asal),
                ctx.getString(R.string.orictolagus_cuniculus_diskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_lop_nama),ctx.getString(R.string.holland_lop_asal),
                ctx.getString(R.string.holland_lop_diskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_lop_nama),ctx.getString(R.string.mini_lop_asal),
                ctx.getString(R.string.mini_lop_diskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.raksasa_nama),ctx.getString(R.string.raksasa_asal),
                ctx.getString(R.string.raksasa_diskripsi), R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama),ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_diskripsi), R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKurakura(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

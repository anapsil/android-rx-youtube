package net.anapsil.easyyoutubelibrary;

import net.anapsil.easyyoutubelibrary.api.Fields;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ana.silva on 14/07/15.
 */
public class EasyYouTubeConfiguration {
    private List<String> mFields;

    private EasyYouTubeConfiguration(Builder builder) {
        this.mFields = builder.mFields;
    }

    public static class Builder {
        private List<String> mFields = new ArrayList<String>();

        public Builder() {
        }

        /**
         * Set YouTube Data Api request fields
         *
         * @param fields
         * @return Builder instance
         */
        public Builder setParameters(Fields[] fields) {
            for (Fields f : fields) {
                mFields.add(f.toString());
            }
            return this;
        }

        public EasyYouTubeConfiguration build() {
            return new EasyYouTubeConfiguration(this);
        }
    }
}

package com.icegreen.greenmail.store;

public final class MetaData {

    private String teaserText;
    private String preview;
    private SmartAttachmentMetaData smartAttachmentMetaData;

    public MetaData(String teaserText, String preview, SmartAttachmentMetaData smartAttachmentMetaData) {
        this.teaserText = teaserText;
        this.preview = preview;
        this.smartAttachmentMetaData = smartAttachmentMetaData;
    }

    public String getTeaserText() {
        return teaserText;
    }

    public void setTeaserText(String teaserText) {
        this.teaserText = teaserText;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public SmartAttachmentMetaData getSmartAttachmentMetaData() {
        return smartAttachmentMetaData;
    }

    public void setSmartAttachmentMetaData(SmartAttachmentMetaData smartAttachmentMetaData) {
        this.smartAttachmentMetaData = smartAttachmentMetaData;
    }

    public static class SmartAttachmentMetaData {

        private final int version;
        private final String smartAttachmentKeyWord;
        private final String mimeType;
        private final int size;
        private final String fileName;

        public SmartAttachmentMetaData(int version, String smartAttachmentKeyWord, String mimeType, int size, String fileName) {
            this.version = version;
            this.smartAttachmentKeyWord = smartAttachmentKeyWord;
            this.mimeType = mimeType;
            this.size = size;
            this.fileName = fileName;
        }

        public int getVersion() {
            return version;
        }

        public String getSmartAttachmentKeyWord() {
            return smartAttachmentKeyWord;
        }

        public String getMimeType() {
            return mimeType;
        }

        public int getSize() {
            return size;
        }

        public String getFileName() {
            return fileName;
        }
    }


}

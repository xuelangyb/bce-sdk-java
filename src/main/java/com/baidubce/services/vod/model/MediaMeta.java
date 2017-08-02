package com.baidubce.services.vod.model;

public class MediaMeta {

    private Long sourceSizeInBytes;

    private Long sizeInBytes;

    private Long durationInSeconds;

    public Long getSourceSizeInBytes() {
        return sourceSizeInBytes;
    }

    public void setSourceSizeInBytes(Long sourceSizeInBytes) {
        this.sourceSizeInBytes = sourceSizeInBytes;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public MediaMeta() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MediaMeta { \n");
        sb.append("      sourceSizeInBytes = ").append(sourceSizeInBytes).append("\n");
        sb.append("      sizeInBytes = ").append(sizeInBytes).append("\n");
        sb.append("      durationInSeconds = ").append(durationInSeconds).append("\n");
        sb.append("    }");
        return sb.toString();
    }
}

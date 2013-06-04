DESCRIPTION = "Linux mainline kernel for Renesas R-Car family"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
# DEPENDS += "lzop-native"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

COMPATIBLE_MACHINE = "rcar-h1-marzen"

KERNEL_IMAGETYPE = "uImage"

PR = "r1"

# Enable this line if you wish to build a kernel compliant with Genivi (www.genivi.org)
#require genivi-requirements.inc

# Greg's 3.4.23 tag
SRCREV = "9fa52906a2e2d6de4f95ee6df185759ee70b59c6"

SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-3.4.y;protocol=git \
	file://defconfig \
	file://0001-mm-page_alloc-remove-trailing-whitespace.patch \
	file://0002-mm-compaction-introduce-isolate_migratepages_range.patch \
	file://0003-mm-compaction-introduce-map_pages.patch \
	file://0004-mm-compaction-introduce-isolate_freepages_range.patch \
	file://0005-mm-compaction-export-some-of-the-functions.patch \
	file://0006-mm-page_alloc-introduce-alloc_contig_range.patch \
	file://0007-mm-page_alloc-change-fallbacks-array-handling.patch \
	file://0008-mm-mmzone-MIGRATE_CMA-migration-type-added.patch \
	file://0009-mm-page_isolation-MIGRATE_CMA-isolation-functions-ad.patch \
	file://0010-mm-Serialize-access-to-min_free_kbytes.patch \
	file://0011-mm-extract-reclaim-code-from-__alloc_pages_direct_re.patch \
	file://0012-mm-trigger-page-reclaim-in-alloc_contig_range-to-sta.patch \
	file://0013-drivers-add-Contiguous-Memory-Allocator.patch \
	file://0014-X86-integrate-CMA-with-DMA-mapping-subsystem.patch \
	file://0015-ARM-integrate-CMA-with-DMA-mapping-subsystem.patch \
	file://0016-net-sh_eth-add-support-R8A7740.patch \
	file://0017-media-adv7180-add-support-to-user-controls.patch \
	file://0018-net-sh_eth-fix-the-rxdesc-pointer-when-rx-descriptor.patch \
	file://0019-ARM-shmobile-r8a7779-Route-all-interrupts-to-ARM.patch \
	file://0020-net-sh_eth-fix-the-condition-to-fix-the-cur_tx-dirty.patch \
	file://0021-media-V4L-fix-a-compiler-warning.patch \
	file://0022-ARM-mach-shmobile-add-fixed-voltage-regulators-to-ma.patch \
	file://0023-ARM-shmobile-marzen-fixup-smsc911x-id-for-regulator.patch \
	file://0024-r8a7779-add-SDHI-clock-support.patch \
	file://0025-ARM-shmobile-marzen-add-SDHI0-support.patch \
	file://0026-ARM-mach-shmobile-marzen-defconfig-update.patch \
	file://0027-thermal-add-Renesas-R-Car-thermal-sensor-support.patch \
	file://0028-ARM-shmobile-marzen-enable-thermal-sensor.patch \
	file://0029-i2c-add-Renesas-R-Car-I2C-driver.patch \
	file://0030-ARM-shmobile-r8a7779-add-HSPI-clock-support.patch \
	file://0031-ARM-shmobile-r8a7779-add-I2C-clock-support.patch \
	file://0032-ARM-shmobile-r8a7779-add-I2C-driver-support.patch \
	file://0033-ARM-shmobile-marzen-add-HSPI-support.patch \
	file://0034-r8a7779-Add-virt-addr-translation-for-upper-16MB.patch \
	file://0035-r8a7779-Add-INTC2-chained-interrupt-handler.patch \
	file://0036-usb-host-Add-USB-host-OHCI-controller-for-R-Car.patch \
	file://0037-usb-host-Add-USB-host-EHCI-controller-for-R-Car.patch \
	file://0038-usb-host-Add-glue-code-for-R-Car-OHCI-EHCI-platform-.patch \
	file://0039-r8a7779-Add-interrupt-support-for-USBH.patch \
	file://0040-r8a7779-add-USB-clock-support.patch \
	file://0041-marzen-add-board-support-for-USB.patch \
	file://0042-dma-hpb-dmae-Add-DMA-Engine-driver-for-R-Car-HPB-DMA.patch \
	file://0043-dma-hpb-dmae-r8a7779-Add-DMA-Engine-driver-for-R-Car.patch \
	file://0044-r8a7779-Add-platform-support-for-R-Car-HPB-DMAC.patch \
	file://0045-marzen-add-dma-support-for-SDHI0.patch \
	file://0046-r8a7779-add-SSI-SRU-clock-support.patch \
	file://0047-sound-soc-ak4642-prevent-un-necessary-changes-to-SG_.patch \
	file://0048-sound-soc-add-support-for-rcar-sru-device.patch \
	file://0049-sound-soc-add-glue-for-marzen-ak4643-sound-card.patch \
	file://0050-marzen-add-board-support-for-audio.patch \
	file://0051-r8a7779-Add-Display-Unit-clock-support.patch \
	file://0052-fb-Add-RCar-framebuffer-driver.patch \
	file://0053-marzen-Add-Display-Unit.patch \
	file://0054-v4l2-Add-RCar-Video-In-VIN-capture-driver.patch \
	file://0055-adv7180.c-convert-to-v4l2-control-framework.patch \
	file://0056-v4l2-adv7180-SoC-camera-support-BT.656.patch \
	file://0057-r8a7779-Add-VIN-clock-support.patch \
	file://0058-marzen-Add-VIN-platform-data.patch \
	file://0059-arm-mm-Reflect-recommended-value-in-CPU-core-and-L2C.patch \
	file://0060-marzen-defconfig-Add-drivers-file-systems-etc.patch \
	file://0061-net-sh_eth-Add-eth-support-for-R8A7779-device.patch \
	file://0062-r8a7779-Add-on-chip-ethernet-module-clock.patch \
	file://0063-mediabus-Add-RGB666-RGB88-formats.patch \
	file://0064-mediabus-add-a-new-data-packing-type-EXTEND32-on-the.patch \
	file://0065-mediabus-add-new-32-bits-data-formats-on-the-media-b.patch \
	file://0066-soc_camera-add-12-18-24-bits-data-width.patch \
	file://0067-rcarvin-Allow-data-widths-16bits.patch \
	file://0068-rcarvin-enable-the-RGB-pass-through-input-mode-for-1.patch \
	file://0069-rcarvin-prevent-duplicating-UYVY-entries-in-the-VIDI.patch \
	file://0070-rcarvin-Convert-colorspace-when-input-output-are-dif.patch \
	file://0071-rcarvin-Add-RGB32-to-the-list-of-supported-formats.patch \
	file://0072-arm-shmobile-r8a7779-Add-SGX-clock.patch \
	file://0073-arm-shmobile-r8a7779-Add-sgx-device.patch \
	file://0074-sata-Add-Renesas-R-Car-SATA-driver.patch \
	file://0075-arm-shmobile-r8a7779-Add-SATA-clock.patch \
	file://0076-marzen-Add-SATA.patch \
	file://0077-marzen-Add-USB-PHY-workaround-for-different-board-ve.patch \
	file://0078-ARM-shmobile-r8a7779-Fix-HPB-DMAC-42-IRQ.patch \
	file://0079-ARM-shmobile-r8a7779-Add-drive-abilities-for-SD-pins.patch \
	file://0080-ARM-shmobile-Fix-dmaengine-module-support.patch \
	file://0081-dma-hpb-dmae-Fix-error-handling-in-hpb_dmae_alloc_ch.patch \
	file://0082-dma-hbp-dmae-Remove-verbose-function.patch \
	file://0083-dma-hpb-dmae-Remove-verbose-return-value.patch \
	file://0084-dma-hpb-dmae-Remove-useless-code.patch \
	file://0085-dma-hpb-dmae-Add-SuperHyway-Port-selector.patch \
	file://0086-video-rcarfb-Fix-error-code-in-set-color-register-fu.patch \
	file://0087-video-rcarfb-Add-ability-to-set-resolution-on-the-cm.patch \
	file://0088-sound-soc-rcar-Fix-hwdep-ioctl.patch \
	file://0089-sound-soc-rcar-Remove-monaural-and-fix-not-use-mutex.patch \
	file://0090-sound-soc-rcar-Fix-platform-resource-release.patch \
	file://0091-sound-soc-rcar-Fix-DMA-channel-request-error.patch \
	file://0092-sound-soc-rcar-Remove-invalid-comment.patch \
	file://0093-serial-sh-sci-Fix-overrun-error-handling.patch \
	file://0094-ARM-shmobile-r8a7779-PFC-rename-PENCx-USB_PENCx.patch \
	file://0095-ARM-shmobile-r8a7779-Fix-PFC-MOD_SEL2-missed-an-entr.patch \
	file://0096-marzen-Setup-pinmux-for-USB2-on-CN22.patch \
	file://0097-marzen-defconfig-Add-SPI-user-mode.patch \
	file://0098-marzen-Add-HSPI2B-for-SPI-Flash.patch \
	file://0099-marzen-Register-spidev-devices.patch \
	file://0100-spi-sh-hspi-add-CS-manual-control-support.patch \
	file://0101-spi-sh-hspi-Improve-performance.patch \
	file://0102-ARM-shmobile-r8a7779-Set-the-SGX-clock-to-clks.patch \
	file://0103-marzen-Set-config-options-to-improve-LTP-results.patch \
	file://0104-ARM-shmobile-r8a7779-Enable-PMU-Performance-Monitori.patch \
	file://0105-SGX-Check-CMA-pool-is-entirely-in-one-DDR-bank.patch \
	file://0106-sata-rcar-Remove-duplicate-entry-in-Kconfig.patch \
	"

#S = "${WORKDIR}/git"
S = "${WORKDIR}/git-dir"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points
EXTRA_OEMAKE += "LOADADDR=${UBOOT_ENTRYPOINT}"

